package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingNationalityESIterator theSelf_governing = (Self_governingNationalityESIterator)findAncestorWithClass(this, Self_governingNationalityESIterator.class);
			pageContext.getOut().print(theSelf_governing.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

