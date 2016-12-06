package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			EditorshipCodeFAOTERMIterator theEditorship = (EditorshipCodeFAOTERMIterator)findAncestorWithClass(this, EditorshipCodeFAOTERMIterator.class);
			pageContext.getOut().print(theEditorship.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

