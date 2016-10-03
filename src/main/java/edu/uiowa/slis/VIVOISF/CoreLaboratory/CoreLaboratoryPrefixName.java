package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratoryPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratoryPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratoryPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratoryPrefixNameIterator theCoreLaboratory = (CoreLaboratoryPrefixNameIterator)findAncestorWithClass(this, CoreLaboratoryPrefixNameIterator.class);
			pageContext.getOut().print(theCoreLaboratory.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

