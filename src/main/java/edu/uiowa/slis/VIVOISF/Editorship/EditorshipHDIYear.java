package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipHDIYearIterator theEditorship = (EditorshipHDIYearIterator)findAncestorWithClass(this, EditorshipHDIYearIterator.class);
			pageContext.getOut().print(theEditorship.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

