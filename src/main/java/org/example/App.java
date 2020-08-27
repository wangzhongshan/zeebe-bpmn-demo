package org.example;

import io.zeebe.model.bpmn.Bpmn;
import io.zeebe.model.bpmn.BpmnModelInstance;
import io.zeebe.model.bpmn.instance.StartEvent;

public class App {
    public static void main(String[] args) {
        BpmnModelInstance bpmnModelInstance = Bpmn.readModelFromStream(App.class.getClassLoader().getResourceAsStream("demo.bpmn"));
        StartEvent startEvent = bpmnModelInstance.getModelElementById("StartEvent_1");
        System.out.println(startEvent.getName());
    }
}
