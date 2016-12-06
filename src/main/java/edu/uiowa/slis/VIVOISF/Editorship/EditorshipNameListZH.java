package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipNameListZHIterator theEditorship = (EditorshipNameListZHIterator)findAncestorWithClass(this, EditorshipNameListZHIterator.class);
			pageContext.getOut().print(theEditorship.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

