package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipNameShortZHIterator theEditorship = (EditorshipNameShortZHIterator)findAncestorWithClass(this, EditorshipNameShortZHIterator.class);
			pageContext.getOut().print(theEditorship.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

