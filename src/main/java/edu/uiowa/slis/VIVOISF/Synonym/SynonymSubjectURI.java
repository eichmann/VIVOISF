package edu.uiowa.slis.VIVOISF.Synonym;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SynonymSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SynonymSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(SynonymSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Synonym theSynonym = (Synonym)findAncestorWithClass(this, Synonym.class);
			if (!theSynonym.commitNeeded) {
				pageContext.getOut().print(theSynonym.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Synonym for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Synonym for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Synonym theSynonym = (Synonym)findAncestorWithClass(this, Synonym.class);
			return theSynonym.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Synonym for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Synonym for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Synonym theSynonym = (Synonym)findAncestorWithClass(this, Synonym.class);
			theSynonym.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Synonym for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Synonym for subjectURI tag ");
		}
	}
}

