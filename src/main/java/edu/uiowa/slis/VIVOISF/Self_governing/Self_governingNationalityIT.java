package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingNationalityITIterator theSelf_governing = (Self_governingNationalityITIterator)findAncestorWithClass(this, Self_governingNationalityITIterator.class);
			pageContext.getOut().print(theSelf_governing.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

