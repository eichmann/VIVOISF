package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingNationalityFRIterator theSelf_governing = (Self_governingNationalityFRIterator)findAncestorWithClass(this, Self_governingNationalityFRIterator.class);
			pageContext.getOut().print(theSelf_governing.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

