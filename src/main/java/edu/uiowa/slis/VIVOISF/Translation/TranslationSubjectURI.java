package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Translation theTranslation = (Translation)findAncestorWithClass(this, Translation.class);
			if (!theTranslation.commitNeeded) {
				pageContext.getOut().print(theTranslation.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Translation theTranslation = (Translation)findAncestorWithClass(this, Translation.class);
			return theTranslation.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Translation for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Translation theTranslation = (Translation)findAncestorWithClass(this, Translation.class);
			theTranslation.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for subjectURI tag ");
		}
	}
}

