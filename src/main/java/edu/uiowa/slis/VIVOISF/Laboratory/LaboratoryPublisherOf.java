package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryPublisherOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryPublisherOf currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryPublisherOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LaboratoryPublisherOfIterator theLaboratoryPublisherOfIterator = (LaboratoryPublisherOfIterator)findAncestorWithClass(this, LaboratoryPublisherOfIterator.class);
			pageContext.getOut().print(theLaboratoryPublisherOfIterator.getPublisherOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for publisherOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for publisherOf tag ");
		}
		return SKIP_BODY;
	}
}

