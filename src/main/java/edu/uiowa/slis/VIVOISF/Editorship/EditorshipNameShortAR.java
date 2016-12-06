package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipNameShortARIterator theEditorship = (EditorshipNameShortARIterator)findAncestorWithClass(this, EditorshipNameShortARIterator.class);
			pageContext.getOut().print(theEditorship.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

