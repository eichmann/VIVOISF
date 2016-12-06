package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipCodeFAOSTATIterator theEditorship = (EditorshipCodeFAOSTATIterator)findAncestorWithClass(this, EditorshipCodeFAOSTATIterator.class);
			pageContext.getOut().print(theEditorship.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

