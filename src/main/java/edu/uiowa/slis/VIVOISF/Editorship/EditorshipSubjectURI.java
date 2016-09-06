package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Editorship theEditorship = (Editorship)findAncestorWithClass(this, Editorship.class);
			if (!theEditorship.commitNeeded) {
				pageContext.getOut().print(theEditorship.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Editorship theEditorship = (Editorship)findAncestorWithClass(this, Editorship.class);
			return theEditorship.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Editorship for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Editorship theEditorship = (Editorship)findAncestorWithClass(this, Editorship.class);
			theEditorship.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for subjectURI tag ");
		}
	}
}

