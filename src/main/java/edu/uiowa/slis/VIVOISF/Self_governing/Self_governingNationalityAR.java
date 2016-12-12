package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingNationalityARIterator theSelf_governing = (Self_governingNationalityARIterator)findAncestorWithClass(this, Self_governingNationalityARIterator.class);
			pageContext.getOut().print(theSelf_governing.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

