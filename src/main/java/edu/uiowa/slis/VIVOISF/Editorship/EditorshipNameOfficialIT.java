package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipNameOfficialITIterator theEditorship = (EditorshipNameOfficialITIterator)findAncestorWithClass(this, EditorshipNameOfficialITIterator.class);
			pageContext.getOut().print(theEditorship.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

