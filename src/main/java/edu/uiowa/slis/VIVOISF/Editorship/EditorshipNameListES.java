package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipNameListESIterator theEditorship = (EditorshipNameListESIterator)findAncestorWithClass(this, EditorshipNameListESIterator.class);
			pageContext.getOut().print(theEditorship.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

