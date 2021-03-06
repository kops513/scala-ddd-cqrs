package event

/**
 * Created by roshansharma on 6/18/15.
 */
trait EventPublisher {

  def publish[T <: DomainEvent](event: T, r: Class[_ <: DomainEvent]): Unit
}
