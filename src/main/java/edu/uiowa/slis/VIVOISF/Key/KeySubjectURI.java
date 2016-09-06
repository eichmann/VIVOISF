package edu.uiowa.slis.VIVOISF.Key;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KeySubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KeySubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(KeySubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Key theKey = (Key)findAncestorWithClass(this, Key.class);
			if (!theKey.commitNeeded) {
				pageContext.getOut().print(theKey.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Key for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Key for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Key theKey = (Key)findAncestorWithClass(this, Key.class);
			return theKey.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Key for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Key for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Key theKey = (Key)findAncestorWithClass(this, Key.class);
			theKey.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Key for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Key for subjectURI tag ");
		}
	}
}

