package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingNationalityZHIterator theSelf_governing = (Self_governingNationalityZHIterator)findAncestorWithClass(this, Self_governingNationalityZHIterator.class);
			pageContext.getOut().print(theSelf_governing.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

