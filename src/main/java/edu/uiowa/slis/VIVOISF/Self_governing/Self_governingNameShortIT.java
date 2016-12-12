package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingNameShortITIterator theSelf_governing = (Self_governingNameShortITIterator)findAncestorWithClass(this, Self_governingNameShortITIterator.class);
			pageContext.getOut().print(theSelf_governing.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

