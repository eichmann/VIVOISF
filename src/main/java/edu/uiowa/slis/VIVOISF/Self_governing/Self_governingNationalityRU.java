package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingNationalityRUIterator theSelf_governing = (Self_governingNationalityRUIterator)findAncestorWithClass(this, Self_governingNationalityRUIterator.class);
			pageContext.getOut().print(theSelf_governing.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

