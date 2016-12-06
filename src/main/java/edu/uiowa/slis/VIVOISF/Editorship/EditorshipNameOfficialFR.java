package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipNameOfficialFRIterator theEditorship = (EditorshipNameOfficialFRIterator)findAncestorWithClass(this, EditorshipNameOfficialFRIterator.class);
			pageContext.getOut().print(theEditorship.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

