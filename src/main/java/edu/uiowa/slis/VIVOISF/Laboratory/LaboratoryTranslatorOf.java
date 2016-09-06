package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryTranslatorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryTranslatorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryTranslatorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LaboratoryTranslatorOfIterator theLaboratoryTranslatorOfIterator = (LaboratoryTranslatorOfIterator)findAncestorWithClass(this, LaboratoryTranslatorOfIterator.class);
			pageContext.getOut().print(theLaboratoryTranslatorOfIterator.getTranslatorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

