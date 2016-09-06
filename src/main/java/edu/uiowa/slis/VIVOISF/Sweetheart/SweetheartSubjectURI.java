package edu.uiowa.slis.VIVOISF.Sweetheart;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SweetheartSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SweetheartSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(SweetheartSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Sweetheart theSweetheart = (Sweetheart)findAncestorWithClass(this, Sweetheart.class);
			if (!theSweetheart.commitNeeded) {
				pageContext.getOut().print(theSweetheart.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Sweetheart for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Sweetheart for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Sweetheart theSweetheart = (Sweetheart)findAncestorWithClass(this, Sweetheart.class);
			return theSweetheart.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Sweetheart for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Sweetheart for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Sweetheart theSweetheart = (Sweetheart)findAncestorWithClass(this, Sweetheart.class);
			theSweetheart.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Sweetheart for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Sweetheart for subjectURI tag ");
		}
	}
}

