package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratoryPublisherOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratoryPublisherOf currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratoryPublisherOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratoryPublisherOfIterator theCoreLaboratoryPublisherOfIterator = (CoreLaboratoryPublisherOfIterator)findAncestorWithClass(this, CoreLaboratoryPublisherOfIterator.class);
			pageContext.getOut().print(theCoreLaboratoryPublisherOfIterator.getPublisherOf());
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for publisherOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for publisherOf tag ");
		}
		return SKIP_BODY;
	}
}

