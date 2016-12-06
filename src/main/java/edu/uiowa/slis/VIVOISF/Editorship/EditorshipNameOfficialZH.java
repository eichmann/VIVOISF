package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipNameOfficialZHIterator theEditorship = (EditorshipNameOfficialZHIterator)findAncestorWithClass(this, EditorshipNameOfficialZHIterator.class);
			pageContext.getOut().print(theEditorship.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

