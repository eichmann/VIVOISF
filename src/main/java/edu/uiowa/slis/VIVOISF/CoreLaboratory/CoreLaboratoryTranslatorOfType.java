package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratoryTranslatorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratoryTranslatorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratoryTranslatorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratoryTranslatorOfIterator theCoreLaboratoryTranslatorOfIterator = (CoreLaboratoryTranslatorOfIterator)findAncestorWithClass(this, CoreLaboratoryTranslatorOfIterator.class);
			pageContext.getOut().print(theCoreLaboratoryTranslatorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

