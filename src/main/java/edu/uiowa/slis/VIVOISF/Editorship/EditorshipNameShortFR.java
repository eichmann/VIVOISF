package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipNameShortFRIterator theEditorship = (EditorshipNameShortFRIterator)findAncestorWithClass(this, EditorshipNameShortFRIterator.class);
			pageContext.getOut().print(theEditorship.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

