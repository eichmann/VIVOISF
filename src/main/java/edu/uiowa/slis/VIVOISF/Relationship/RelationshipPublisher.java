package edu.uiowa.slis.VIVOISF.Relationship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class RelationshipPublisher extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static RelationshipPublisher currentInstance = null;
	private static final Log log = LogFactory.getLog(RelationshipPublisher.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			RelationshipPublisherIterator theRelationshipPublisherIterator = (RelationshipPublisherIterator)findAncestorWithClass(this, RelationshipPublisherIterator.class);
			pageContext.getOut().print(theRelationshipPublisherIterator.getPublisher());
		} catch (Exception e) {
			log.error("Can't find enclosing Relationship for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing Relationship for publisher tag ");
		}
		return SKIP_BODY;
	}
}

