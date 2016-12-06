package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipCodeISO2Iterator theEditorship = (EditorshipCodeISO2Iterator)findAncestorWithClass(this, EditorshipCodeISO2Iterator.class);
			pageContext.getOut().print(theEditorship.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

