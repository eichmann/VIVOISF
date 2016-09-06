package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryPublisherOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryPublisherOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryPublisherOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LaboratoryPublisherOfIterator theLaboratoryPublisherOfIterator = (LaboratoryPublisherOfIterator)findAncestorWithClass(this, LaboratoryPublisherOfIterator.class);
			pageContext.getOut().print(theLaboratoryPublisherOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for publisherOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for publisherOf tag ");
		}
		return SKIP_BODY;
	}
}

