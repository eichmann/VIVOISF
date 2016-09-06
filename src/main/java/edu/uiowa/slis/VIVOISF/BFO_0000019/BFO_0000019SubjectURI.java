package edu.uiowa.slis.VIVOISF.BFO_0000019;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000019SubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000019SubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000019SubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000019 theBFO_0000019 = (BFO_0000019)findAncestorWithClass(this, BFO_0000019.class);
			if (!theBFO_0000019.commitNeeded) {
				pageContext.getOut().print(theBFO_0000019.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000019 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000019 for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			BFO_0000019 theBFO_0000019 = (BFO_0000019)findAncestorWithClass(this, BFO_0000019.class);
			return theBFO_0000019.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing BFO_0000019 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000019 for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			BFO_0000019 theBFO_0000019 = (BFO_0000019)findAncestorWithClass(this, BFO_0000019.class);
			theBFO_0000019.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000019 for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000019 for subjectURI tag ");
		}
	}
}

