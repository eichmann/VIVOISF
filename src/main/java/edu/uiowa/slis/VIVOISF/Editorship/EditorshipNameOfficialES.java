package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipNameOfficialESIterator theEditorship = (EditorshipNameOfficialESIterator)findAncestorWithClass(this, EditorshipNameOfficialESIterator.class);
			pageContext.getOut().print(theEditorship.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

