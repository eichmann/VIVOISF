package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipNameShortESIterator theEditorship = (EditorshipNameShortESIterator)findAncestorWithClass(this, EditorshipNameShortESIterator.class);
			pageContext.getOut().print(theEditorship.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

