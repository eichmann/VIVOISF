package edu.uiowa.slis.VIVOISF.Pager;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PagerSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PagerSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(PagerSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Pager thePager = (Pager)findAncestorWithClass(this, Pager.class);
			if (!thePager.commitNeeded) {
				pageContext.getOut().print(thePager.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Pager for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Pager for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Pager thePager = (Pager)findAncestorWithClass(this, Pager.class);
			return thePager.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Pager for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Pager for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Pager thePager = (Pager)findAncestorWithClass(this, Pager.class);
			thePager.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Pager for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Pager for subjectURI tag ");
		}
	}
}

