package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipNameListFRIterator theEditorship = (EditorshipNameListFRIterator)findAncestorWithClass(this, EditorshipNameListFRIterator.class);
			pageContext.getOut().print(theEditorship.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

