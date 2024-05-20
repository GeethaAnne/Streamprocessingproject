package streamprocessingapp;

// @@@SNIPSTART money-transfer-project-template-java-activity-interface

import io.temporal.activity.ActivityInterface;
import io.temporal.activity.ActivityMethod;

@ActivityInterface
public interface KafkaActivity {

    @ActivityMethod
        void ingestFromKafka();
    }

// @@@SNIPEND
