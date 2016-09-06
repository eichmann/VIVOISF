package edu.uiowa.slis.VIVOISF.EmeritusFaculty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EmeritusFacultyTranslatorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EmeritusFacultyTranslatorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(EmeritusFacultyTranslatorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EmeritusFacultyTranslatorOfIterator theEmeritusFacultyTranslatorOfIterator = (EmeritusFacultyTranslatorOfIterator)findAncestorWithClass(this, EmeritusFacultyTranslatorOfIterator.class);
			pageContext.getOut().print(theEmeritusFacultyTranslatorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EmeritusFaculty for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing EmeritusFaculty for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

