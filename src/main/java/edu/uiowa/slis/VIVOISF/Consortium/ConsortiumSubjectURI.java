package edu.uiowa.slis.VIVOISF.Consortium;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConsortiumSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConsortiumSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ConsortiumSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Consortium theConsortium = (Consortium)findAncestorWithClass(this, Consortium.class);
			if (!theConsortium.commitNeeded) {
				pageContext.getOut().print(theConsortium.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Consortium theConsortium = (Consortium)findAncestorWithClass(this, Consortium.class);
			return theConsortium.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Consortium for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Consortium theConsortium = (Consortium)findAncestorWithClass(this, Consortium.class);
			theConsortium.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Consortium for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Consortium for subjectURI tag ");
		}
	}
}

