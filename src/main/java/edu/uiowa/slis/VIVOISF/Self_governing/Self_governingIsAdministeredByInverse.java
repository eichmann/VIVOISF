package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingIsAdministeredByInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingIsAdministeredByInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingIsAdministeredByInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			Self_governingIsAdministeredByInverseIterator theSelf_governingIsAdministeredByInverseIterator = (Self_governingIsAdministeredByInverseIterator)findAncestorWithClass(this, Self_governingIsAdministeredByInverseIterator.class);
			pageContext.getOut().print(theSelf_governingIsAdministeredByInverseIterator.getIsAdministeredByInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for isAdministeredBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for isAdministeredBy tag ");
		}
		return SKIP_BODY;
	}
}

