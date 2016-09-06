package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EmeritusFacultyFreetextKeywordIterator theEmeritusFaculty = (EmeritusFacultyFreetextKeywordIterator)findAncestorWithClass(this, EmeritusFacultyFreetextKeywordIterator.class);
			pageContext.getOut().print(theEmeritusFaculty.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

