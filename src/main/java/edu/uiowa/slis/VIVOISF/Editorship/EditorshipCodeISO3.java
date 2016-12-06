package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipCodeISO3Iterator theEditorship = (EditorshipCodeISO3Iterator)findAncestorWithClass(this, EditorshipCodeISO3Iterator.class);
			pageContext.getOut().print(theEditorship.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

