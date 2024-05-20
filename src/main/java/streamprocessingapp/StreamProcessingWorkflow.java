package streamprocessingapp;

import io.temporal.workflow.WorkflowInterface;
import io.temporal.workflow.WorkflowMethod;

// @@@SNIPSTART money-transfer-project-template-java-workflow-interface
@WorkflowInterface
public interface StreamProcessingWorkflow {

    // The Workflow method is called by the initiator either via code or CLI.

        @WorkflowMethod
        void executePipeline();
}
// @@@SNIPEND
