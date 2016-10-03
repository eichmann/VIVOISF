package edu.uiowa.slis.VIVOISF.Seq;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SeqSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SeqSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(SeqSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Seq theSeq = (Seq)findAncestorWithClass(this, Seq.class);
			if (!theSeq.commitNeeded) {
				pageContext.getOut().print(theSeq.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Seq for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Seq for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Seq theSeq = (Seq)findAncestorWithClass(this, Seq.class);
			return theSeq.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Seq for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Seq for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Seq theSeq = (Seq)findAncestorWithClass(this, Seq.class);
			theSeq.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Seq for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Seq for subjectURI tag ");
		}
	}
}

