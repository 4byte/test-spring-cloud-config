package com.ex.microservices.lab.statistics.statisticsservice.contoller;

import com.ex.microservices.lab.statistics.statisticsservice.service.NameService;
import org.springframework.amqp.core.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableBinding(Sink.class)
@RefreshScope
@Component
@Controller
@RequestMapping("/")
public class NameController {
	@Autowired
	private Sink sink;
	@Autowired
	private NameService nameService;

	@StreamListener(target = Sink.INPUT)
	public void processNameFromQueue(Message name) {
		name.getMessageProperties().setContentType("text/plain");
		nameService.addName(new String(name.getBody()));
		System.out.println("Refreshed name " + name);
	}
}
