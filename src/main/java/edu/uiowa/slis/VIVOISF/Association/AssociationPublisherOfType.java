package edu.uiowa.slis.VIVOISF.Association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AssociationPublisherOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AssociationPublisherOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(AssociationPublisherOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AssociationPublisherOfIterator theAssociationPublisherOfIterator = (AssociationPublisherOfIterator)findAncestorWithClass(this, AssociationPublisherOfIterator.class);
			pageContext.getOut().print(theAssociationPublisherOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Association for publisherOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for publisherOf tag ");
		}
		return SKIP_BODY;
	}
}

