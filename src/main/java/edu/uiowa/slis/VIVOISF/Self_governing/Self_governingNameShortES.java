package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingNameShortESIterator theSelf_governing = (Self_governingNameShortESIterator)findAncestorWithClass(this, Self_governingNameShortESIterator.class);
			pageContext.getOut().print(theSelf_governing.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

