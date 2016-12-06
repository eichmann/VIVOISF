package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipGDPYearIterator theEditorship = (EditorshipGDPYearIterator)findAncestorWithClass(this, EditorshipGDPYearIterator.class);
			pageContext.getOut().print(theEditorship.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

