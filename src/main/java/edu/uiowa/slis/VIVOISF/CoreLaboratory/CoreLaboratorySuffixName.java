package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratorySuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratorySuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratorySuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratorySuffixNameIterator theCoreLaboratory = (CoreLaboratorySuffixNameIterator)findAncestorWithClass(this, CoreLaboratorySuffixNameIterator.class);
			pageContext.getOut().print(theCoreLaboratory.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

