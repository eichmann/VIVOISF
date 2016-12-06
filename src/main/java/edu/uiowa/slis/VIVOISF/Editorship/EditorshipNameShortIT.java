package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipNameShortITIterator theEditorship = (EditorshipNameShortITIterator)findAncestorWithClass(this, EditorshipNameShortITIterator.class);
			pageContext.getOut().print(theEditorship.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

