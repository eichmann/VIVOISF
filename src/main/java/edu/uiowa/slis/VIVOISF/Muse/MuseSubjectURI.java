package edu.uiowa.slis.VIVOISF.Muse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Muse theMuse = (Muse)findAncestorWithClass(this, Muse.class);
			if (!theMuse.commitNeeded) {
				pageContext.getOut().print(theMuse.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Muse for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Muse for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Muse theMuse = (Muse)findAncestorWithClass(this, Muse.class);
			return theMuse.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Muse for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Muse for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Muse theMuse = (Muse)findAncestorWithClass(this, Muse.class);
			theMuse.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Muse for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Muse for subjectURI tag ");
		}
	}
}

