package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipNameListARIterator theEditorship = (EditorshipNameListARIterator)findAncestorWithClass(this, EditorshipNameListARIterator.class);
			pageContext.getOut().print(theEditorship.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

