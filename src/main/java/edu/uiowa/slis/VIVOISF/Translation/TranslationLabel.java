package edu.uiowa.slis.VIVOISF.Translation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class TranslationLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static TranslationLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(TranslationLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Translation theTranslation = (Translation)findAncestorWithClass(this, Translation.class);
			if (!theTranslation.commitNeeded) {
				pageContext.getOut().print(theTranslation.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Translation theTranslation = (Translation)findAncestorWithClass(this, Translation.class);
			return theTranslation.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Translation for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Translation theTranslation = (Translation)findAncestorWithClass(this, Translation.class);
			theTranslation.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Translation for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Translation for label tag ");
		}
	}
}

